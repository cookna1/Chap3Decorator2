import java.io.*;

public class countInputStream extends FilterInputStream {
    int count = 0;

    public countInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = in.read();
        if (c != 1)
            count++;
        return c; 

    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        count += result;
        return result; 

    }
}
