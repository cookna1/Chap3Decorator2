import java.io.*;

public class countInputStream extends FilterInputStream {
    int count;

    public countInputStream(InputStream in) {
        super(in);
        count = 0;
    }

    public int read() throws IOException {
        int c = in.read();
        count = c >= 0 ? ++count : count;

        return c; 

    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        count += result;
        return count; 

    }
    public void close() throws IOException {
        System.out.println("Total Character Count: " + count);
        in.close();
    }
}
