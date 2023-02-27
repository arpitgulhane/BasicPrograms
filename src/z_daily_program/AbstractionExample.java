package z_daily_program;


    public abstract class AbstractionExample {



        abstract void getName(); // in child class



        abstract void getAddress();



        public void getLastName() {

            System.out.println("Gavhad");

        } // here i am having body



    }

    // to apply inheritance concept => clone/get all properties of parent class

    class Child extends AbstractionExample{



        void getName() {

            System.out.println("Ganesh");

        }

        void getAddress() {

            System.out.println("AGgaGjahHJ");

        }



        public static void main (String args [] ) {



            Child obj = new Child();

            //getName // getAddress

            obj.getLastName();

            obj.getAddress();

            obj.getName();

        }

    }
