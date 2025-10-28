import org.bytedeco.onnxruntime.OrtApiBase;

import static org.bytedeco.onnxruntime.global.onnxruntime.OrtGetApiBase;

public class Mini {
    static final OrtApiBase g_ort = OrtGetApiBase();
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
