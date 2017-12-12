import UsingTraits.{Cat, Friend}

/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
// #snip
def useFriend(friend: Friend): Unit = friend.listen()

val angel = new Cat("Angel") with Friend
val friend : Friend = angel
angel.listen()

useFriend(angel)
// #snip
