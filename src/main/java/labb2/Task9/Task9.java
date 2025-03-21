package labb2.Task9;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Task9 {
    public static void main(String[] args) {
        BlockingQueue<Detail> queue1 = new LinkedBlockingQueue<>();
        BlockingQueue<Detail> queue2 = new LinkedBlockingQueue<>();

        Stamper stamper = new Stamper(queue1);
        Assembler assembler = new Assembler(queue1, queue2);
        QualityControl qualityControl = new QualityControl(queue2);

        stamper.start();
        assembler.start();
        qualityControl.start();
    }
}