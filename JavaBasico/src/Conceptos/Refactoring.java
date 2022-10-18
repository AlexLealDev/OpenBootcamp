package Conceptos;

public class Refactoring {

    // El refactoring consiste en adaptar un cógido para que sea más legible y fácil de mantener

    /*
    Técnicas más frecuentes:
    1. Condicionales consolidados.
        Ante un grupo de condiciones (if) que se está haciendo largo se puede invocar un método que reuna las condiciones
        por lo que el if solo tendría que invocar el método:

        MAL
        double calculateExtraSalary(){
            double result = 0;
            if (seniority<1){
                return 0;
            }
            if (education<1){
                return 0;
            }
            if (incidentes>10){
                return 0;
            }
             if (!certifications{
                return 0;
            }
            //... (seguiría)
            return result;

        BIEN
        double calculateExtraSalary(){
            double (!isEligibleExtraSalary)(){
                return result;
            }
            // calculate extra salary
            result += 5;

            return result;

        }

        private boolean isEligibleExtraSalary() {
        boolean estudios = seniority<1 || education<1; // categoria
        boolean experiencia = incidentes>10 || !certification; // categoria
        return estudios || experiencia;
        }

    2. Condicionales duplicados.
        Ante un grupo de condiciones (if) que aparece duplicado en los if/else, se debe extraer esos códigos fuera de los
        if/else.

        MAL

        double calculateExtraSalary(){
            double result = 0;
            if (isElegibleSalary()){
                result = 500;
                sendMessage(); //método que se repite en la condición
            }else{
                result = 0;
                sendMessage(); //método que se repite en la condición
            }
            return result;
        }

        private void sendMessage(){
            //send mail
            //send stmp
            System.out.println("Sending message");
        }

        BIEN

        double calculateExtraSalary(){
            double result = 0;
            if (isElegibleSalary()){
                result = 500;
            }else{
                result = 0;
            }
            sendMessage(); // ahora el método no se repite
            return result;
        }

        private void sendMessage(){
            //send mail
            //send stmp
            System.out.println("Sending message");
        }

    3. Extract Class
        Cuando tenemos una clase que ese está extendiendo mucho y tenemos una serie de atribitos que se podrían agrupar
        en otra clase,

        MAL

        public class Person{

            private Long id;
            private String firstName;
            private String lastName;
            private Integer age;
            //adress
            private String address;
            private String city;
            private String state;
            private String zipCode;

        }

        BIEN

        public class Person{

            private Long id;
            private String firstName;
            private String lastName;
            private Integer age;
            private Address address; // abriríamos un nuevo archivo Clase y definiríamos los atributos de la clase Address

        }

    4. Extract Methods
        Si tenemos un método en el cual hay un código que fácilmente se podría llevar a otro método, podemos coger ese código
        pinchar en el botón derecho y darle a Refactor > Extract Methods, que nos permitirá llevar ese código a un método separado


        MAL

        public class Main {

            void printHTML(){

                printHead();
                printBody();
                System.out.println("This is the footer");
                System.out.println("scrip");
                System.out.println("copy");
                System.out.println(" ");
            }

            private void printHead(){
            }
            private void printBody(){
            }

        }

        BIEN

        public class Main {

            void printHTML(){

                printHead();
                printBody();
                printFooter();

            }

            private void printFooter(){
                System.out.println("This is the footer");
                System.out.println("scrip");
                System.out.println("copy");
                System.out.println(" ");
            }


            private void printHead(){
            }
            private void printBody(){
            }

        }

    5. Extract Variable
        Al encontrar una función con multitud de variables que haga ilegible la misma, se deben sacar las variables fuera
        de la función, para ello pinchar en botón derecho y darle a Refactor > Introduce Variable, lo que permitiría sacar
        en variables separadas cada operación y ponerle un nombre a cada variable que sea descriptivo para luego ir haciendo
        las operaciones poco a poco de una en una.

        MAL

        public class Main {

            void printProductPrice(){
                Double totalPrice = order.getPrice() * order.getQuantity() -
                    order.getDiscount() + order.getShipping() * 2;

                System.out.println(totalPrice);
            }


        }

        BIEN

        public class Main {

            void printProductPrice(Order order) {

            //1. precio total de los productos
            Double quantityPrice = order.getPrice() * order.getQuantity();

            //2. descuento
            Double offerPrice = order.getPrice() + order.getOffer();

            //3. precio final = precio total menos el descuento
            Double finalPrice = quantityPrice - offerPrice;

            //4. cálculo del precio del envío
            Double shippingPrice = order.getShipping() * 2;

            //5. precio final
            System.out.println("finalPrice + shippingPrice);
            }

        }
     */

}
