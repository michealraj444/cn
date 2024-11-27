import java.util.Scanner;

class crc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the generator
        System.out.println("Enter generator");
        String gen = sc.next();

        // Input the data
        System.out.println("Enter data:");
        String data = sc.next();
        String code = data;

        // Append zeros to the data
        while (code.length() < (data.length() + gen.length() - 1)) {
            code = code + "0";
        }

        // Compute the CRC
        code = data + div(code, gen);
        System.out.println("The transmitted word is " + code);

        // Input the received code
        System.out.println("Enter received code:");
        String rec = sc.next();
        if (Integer.parseInt(div(rec, gen)) == 0) {
            System.out.println("No errors");
        } else {
            System.out.println("Errors");
        }

        sc.close();
    }

    // Division function
    static String div(String a, String b) {
        int len = b.length(); // Corrected 'l' to 'len'
        String result = a.substring(0, len);
        String rem = "";

        // Perform XOR operation
        for (int i = 0; i < len; i++) {
            if (result.charAt(i) == b.charAt(i)) {
                rem = rem + "0";
            } else {
                rem = rem + "1";
            }
        }

        while (len < a.length()) {
            if (rem.charAt(0) == '0') { // Corrected "==" to '==' for char comparison
                rem = rem.substring(1);
                rem = rem + a.charAt(len);
                len++;
            }
            result = rem;
            rem = "";
            for (int i = 0; i < b.length(); i++) {
                if (result.charAt(i) == b.charAt(i)) {
                    rem = rem + "0";
                } else {
                    rem = rem + "1";
                }
            }
        }

        return rem.substring(1);
    }
}
