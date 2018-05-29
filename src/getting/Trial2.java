package getting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Trial2 {
	
	public static void main(String []args) throws IOException {
		writerLog();
		return ;
	}
    public static void writerLog() throws IOException {
        final File logFile = new File("trail.txt");
        if(!logFile.exists()) {
            logFile.createNewFile();
        }
        //启动一个线程每2秒钟向日志文件写一次数据
        ScheduledExecutorService exec =  Executors.newScheduledThreadPool(1);
        
        exec.scheduleWithFixedDelay(new Runnable(){
            public void run() {
                try {
                    if(logFile == null) {
                        throw new IllegalStateException("logFile can not be null!");
                    }
                    @SuppressWarnings("resource")
					Writer txtWriter = new FileWriter(logFile,true);
                    Date date =new Date();
                    
                    txtWriter.write(date.toString()+'\n');
                    txtWriter.flush();
                    System.out.println(date.toString());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }, 0, 2, TimeUnit.SECONDS);
    }
}
