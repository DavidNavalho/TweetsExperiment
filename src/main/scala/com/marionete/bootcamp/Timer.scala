package com.marionete.bootcamp

/**
  * Created by davidnavalho on 26/10/2016.
  */
object Timer {
  var running = false
  var time: Long = 0

  def start {
    println("Starting a counter")
    this.running = true
    this.time = System.currentTimeMillis()
  }

  def stop {
    this.running = false
    println("Total time elapsed since start: "+(System.currentTimeMillis()-time)+"ms.")
  }

}
