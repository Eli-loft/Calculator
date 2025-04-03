import java.util.ArrayList;
import java.util.List;

public class Calc {
    private double result = 0;

    public double evaluate(String[] tokens) {
        List<String> intermediate = new ArrayList<>();

        // Handle * and /
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("*") || token.equals("/")) {
                double left = Double.parseDouble(intermediate.remove(intermediate.size() - 1));
                double right = Double.parseDouble(tokens[++i]);
                double computed = token.equals("*") ? left * right : left / right;
                intermediate.add(String.valueOf(computed));
            } else {
                intermediate.add(token);
            }
        }

        // Handle + and -
        result = Double.parseDouble(intermediate.get(0));
        for (int i = 1; i < intermediate.size(); i += 2) {
            String op = intermediate.get(i);
            double num = Double.parseDouble(intermediate.get(i + 1));
            result = switch (op) {
                case "+" -> result + num;
                case "-" -> result - num;
                default -> throw new IllegalArgumentException("Invalid operator: " + op);
            };
        }

        return result;
    }

    public double getResult() {
        return result;
    }
}
