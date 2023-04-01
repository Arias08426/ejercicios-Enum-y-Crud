package ejerciciosEnum;

public class Ejemplo5 {

    enum Ice_Cream {
        chocolate("It is made by mixing cocoa powder together with the eggs, cream, " +
                "vanilla and sugar used to make vanilla ice cream."), Coconut(" It is rich in antioxidants and has benefits that help regulate" +
                " blood pressure and lower triglycerides."), Vanilla("a mixture made of cream, sugar and vanilla over a bowl with ice and salt.");

        private String Information;

        private Ice_Cream(String Information){
            this.Information = Information;
        }

        public String getInformation() {
            return Information;
        }
    }
    public class Example{
        public static void main(String[] args) {
            Ice_Cream iceCream = Ice_Cream.Vanilla;
            System.out.println(iceCream.getInformation());
        }
    }

    }

