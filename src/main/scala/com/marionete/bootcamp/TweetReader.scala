package com.marionete.bootcamp

import scala.io.{BufferedSource, Source}
import scala.util.Random

/**
  * Created by davidnavalho on 25/10/2016.
  */
class TweetReader(source: String) {

  private var maxRandomToSearch: Int = 42//If we increment this, we can get a random tweet...but....
  def setRandom(newMax: Int): Unit ={
    this.maxRandomToSearch = newMax
  }

  def readFirstTweet: Tweet = {
    new Tweet(Source.fromFile(source).getLines().next())
  }

  def readRandomTweet: Tweet = {
    val reader: BufferedSource = Source.fromFile(source)
    val tweetLine: Int  = new Random().nextInt(maxRandomToSearch)
    val it: Iterator[String] = reader.getLines()
    for{k <- 1 to tweetLine}{it.next()}
    val chosenTweet: String = it.next()
    reader.close()
    new Tweet(chosenTweet)
  }

  def getAllTweets: List[Tweet] = {
    List.empty
  }
}


object Tester extends App{
  Timer.start
  val tr = new TweetReader("/Users/davidnavalho/Desktop/tweets3.log")
  Timer.stop
}