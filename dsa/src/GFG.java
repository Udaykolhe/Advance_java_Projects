class GFG {
  
    static int calculator(String str)
    {
        // Split expression string using + operator.
        // Now every index will have either an integer or an
        // expression of only products.
        String[] arr = str.split("\\+");
  
        for (int i = 0; i < arr.length; i++) {
            int result = 1;
  
            // If index contains * sign,
            // split expression using *
            if (arr[i].contains("*")) {
                String[] num = arr[i].split("\\*");
  
                // Multiply each number separated by * and
                // store final product in 'result' variable
                for (int j = 0; j < num.length; j++) {
                    result *= Integer.parseInt(num[j]);
                }
  
                // Store resultant product value in the
                // array index. For ex: index having 2*3 is
                // replaced by 6 and index having 4*5*6 is
                // replaced by 120.
                arr[i] = String.valueOf(result);
            }
        }
  
        // Now every array index has a
        // single integer as element.
        int len = arr.length;
        int sum = 0;
  
        // Calculate the sum of all elements
        // of array to get final result.
        for (int i = 0; i < len; i++) {
            sum += Integer.parseInt(arr[i]);
        }
  
        // Return the final result
        return sum;
    }
  
    public static void main(String[] args)
    {
        // Expression string is: 1+2*3+4*5*6
        System.out.println(calculator("5 6 2 + * 12 4 / -"));
    }
}