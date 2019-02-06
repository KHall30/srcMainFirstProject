package JobSelection.JobInformationIndex.JobAmazonData;

import java.util.*;
import java.io.*;
import java.util.Scanner.*;
import java.util.Arrays.*;

// Primary Data for Amazon;
// JobAmazonData.amazonBaseStats();
public class JobAmazonData{
  private static String[] jobAmazonBaseStats = new String[] {"4 Strength","6 Intelligence","6 Stamina","8 Luck","8 Speed","40 Health"};

  public static void amazonBaseStats(){
    for(String baseStats:jobAmazonBaseStats){
      System.out.println(baseStats);
    }
  }
}