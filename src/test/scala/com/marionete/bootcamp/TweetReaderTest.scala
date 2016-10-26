package com.marionete.bootcamp

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by davidnavalho on 26/10/2016.
  */
class TweetReaderTest extends WordSpec with Matchers{

  "TweetReader readATweet" should {
    "Produce a readable string" in {
      new TweetReader("singleTweet.log").readATweet+"" shouldBe "I liked a @YouTube video from @looper https://t.co/0uUjCARCaa How The Nintendo Switch Could Be Better Than Both PS4 And Xbox One"
    }
  }
}
