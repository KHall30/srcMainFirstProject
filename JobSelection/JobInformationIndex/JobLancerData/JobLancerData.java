package JobSelection.JobInformationIndex.JobLancerData;

import java.util.*;
import java.io.*;
import java.util.Scanner.*;
import java.util.Arrays.*;

// Primary Data for Lancer;
// JobLancerData.lancerBaseStats();
public class JobLancerData{

  private static String[] jobLancerBaseStats = new String[] {"10 Strength","4 Intelligence","10 Stamina","6 Luck","5 Speed","50 Health"};

  public static void lancerBaseStats(){
    for(String baseStats:jobLancerBaseStats){
      System.out.println(baseStats);
    }
  }
}