package JobSelection.JobInformationIndex.JobWitchData;

import java.util.*;
import java.io.*;
import java.util.Scanner.*;
import java.util.Arrays.*;

// Primary Data for Bandit;
// JobWitchData.witchBaseStats(); refrence;
public class JobWitchData{
  private static String[] jobWitchBaseStats = new String[] {"3 Strength","8 Intelligence","7 Stamina","6 Luck","5 Speed","45 Health"};

  public static void witchBaseStats(){
    for(String baseStats:jobWitchBaseStats){
      System.out.println(baseStats);
    }
  }
}