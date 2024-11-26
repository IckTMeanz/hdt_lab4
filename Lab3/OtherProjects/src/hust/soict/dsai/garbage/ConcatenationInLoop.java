package hust.soict.dsai.garbage;

import java.util.Random;

public class ConcatenationInLoop {
	public static void main(String[] args) {
//        Random r = new Random(123);
//        long start = System.currentTimeMillis();
//        String s = "";
//        for (int i = 0; i < 65536; i++) {
//            s += r.nextInt(2);
//        }
//        System.out.println(System.currentTimeMillis() - start); // This prints roughly 4000
//
//        r = new Random(123);
//        start = System.currentTimeMillis();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 65536; i++) {
//            sb.append(r.nextInt(2));
//        }
//        s = sb.toString();
//        System.out.println(System.currentTimeMillis() - start); // This prints 5
		
		try {
			GarbageCreator.garbageCreating();
			NoGarbage.garbageAvoiding();
		}catch(Exception e) {
			e.printStackTrace();
		}
    }
}
