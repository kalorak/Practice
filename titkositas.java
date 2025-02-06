import java.io.IOException;

public class titkositas {
    public static void main(String[] args) throws IOException {
        int c;

        while ( ( c = System.in.read() ) != '\n') {
            c++;
            System.out.print((char)c);
        }

    }
}
