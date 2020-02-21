package org.spark.streaming

import org.apache.spark.sql.SparkSession

object Test {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("test")
      .config("spark.master","local[*]")
      .getOrCreate();

   val df= spark.read.format("text").load("src/main/resources/twitter.txt")

    df.show()
  }

}
