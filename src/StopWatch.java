/**
02:    A stopwatch accumulates time when it is running. You can 
03:    repeatedly start and stop the stopwatch. You can use a
04:    stopwatch to measure the running time of a program.
05: */
 public class StopWatch
 {  
    /**
09:       Constructs a stopwatch that is in the stopped state
10:       and has no time accumulated.
11:    */
    public StopWatch()
    {  
       reset();
    }
 
    /**
18:       Starts the stopwatch. Time starts accumulating now.
19:    */
    public void start()
    {  
       if (isRunning) return;
       isRunning = true;
       startTime = System.currentTimeMillis();
    }
    
    /**
28:       Stops the stopwatch. Time stops accumulating and is
29:       is added to the elapsed time.
30:    */
    public void stop()
    {  
       if (!isRunning) return;
       isRunning = false;
       long endTime = System.currentTimeMillis();
       elapsedTime = elapsedTime + endTime - startTime;
    }
    
    /**
40:       Returns the total elapsed time.
41:       @return the total elapsed time
42:    */
    public long getElapsedTime()
    {  
       if (isRunning) 
       {  
          long endTime = System.currentTimeMillis();
          return elapsedTime + endTime - startTime;
       }
       else
          return elapsedTime;
    }
    
    /**
55:       Stops the watch and resets the elapsed time to 0.
56:    */
    public void reset()
    {  
       elapsedTime = 0;
       isRunning = false;
    }
    
    private long elapsedTime;
    private long startTime;
    private boolean isRunning;
 }