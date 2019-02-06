package JobSelection.JobInformationIndex.JobBanditData;

import java.util.*;
import java.io.*;
import java.util.Scanner.*;
import java.util.Arrays.*;

// Primary Data for Bandit;
// JobBanditData.banditBaseStats();
public class JobBanditData{
  private static String[] jobBanditBaseStats = new String[] {"6 Strength","6 Intelligence","6 Stamina","6 Luck","9 Speed","47 Health"};

  public static void banditBaseStats(){
    for(String baseStats:jobBanditBaseStats){
      System.out.println(baseStats);
    }
  }
}