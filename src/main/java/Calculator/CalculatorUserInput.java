package Calculator;

public class CalculatorUserInput {
        public int calculateUser(String input) {
            String[] expression = separate(input);

            int result = getInt(expression[0]);
            for(int i=0; i<expression.length-2; i+=2){
                result = Operator.calculate(result, getInt(expression[i+2]), expression[i+1]);
            }
            return result;
        }

        private int getInt(String str){
            return Integer.parseInt(str);
        }

        public String[] separate(String str){
            return str.split(" ");
        }
}
