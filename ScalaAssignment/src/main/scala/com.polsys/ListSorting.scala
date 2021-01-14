package com.polsys

import scala.collection.mutable.ListBuffer
import scala.io.StdIn

/**
  * Created by Vaijnath Polsane on 13-12-2018.
  */

object ListCustomSort {
  def sort(list: List[Int]) : List[(Int,List[Int])] = {
    val groupedData = list.map(number => (number, 1)).groupBy(_._1)
    val valueFrequencyMap = groupedData.mapValues(list => list.map(_._2).sum )
    sortListByValue(valueFrequencyMap).sortWith(_._1 < _._1)
  }

  private def sortListByValue(valueFrequencyMap: Map[Int, Int]) = {
    valueFrequencyMap.groupBy(_._2)
      .map(e => e._1 -> e._2.toList.map(e => e._1)
        .sortWith(_ < _))
      .toList
  }

  def printSortedElementWithFrequency(p: List[(Int, List[Int])]): Unit = {
    p.flatMap(e => {
      val list = ListBuffer[Int]()
      e._2.foreach(ele => (0 until e._1).foreach(_ => list += ele))
      list
    }).foreach(println)
  }
}

object ListSortByFrequencyAndThenValue {
  def main(args: Array[String]) {
    val list: List[Int] = getListElements()
    val sortedListByValue = ListCustomSort.sort(list)
    ListCustomSort.printSortedElementWithFrequency(sortedListByValue)
  }

  private def getListElements():List[Int] = {
    StdIn.readLine.trim.split(" ").map(e => e.toInt).toList
  }
}
