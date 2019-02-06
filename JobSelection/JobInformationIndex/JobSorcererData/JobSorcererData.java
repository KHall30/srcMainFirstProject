package JobSelection.JobInformationIndex.JobSorcererData;

import java.util.*;
import java.io.*;
import java.util.Scanner.*;
import java.util.Arrays.*;

// Primary Data for Sorcerer;
// JobSorcererData.sorcererBaseStats(); refrence;
public class JobSorcererData{
  private static String[] jobSorcererBaseStats = new String[] {"3 Strength","10 Intelligence","5 Stamina","7 Luck","6 Speed","45 Health"};

  public static void sorcererBaseStats(){
    for(String baseStats:jobSorcererBaseStats){
      System.out.println(baseStats);
    }
  }
}