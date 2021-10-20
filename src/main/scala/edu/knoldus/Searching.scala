package edu.knoldus

class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    def binarySearchHelper(startIndex: Int, endIndex: Int, item: Int, array: Array[Int]): Boolean = {
      if (endIndex < startIndex) {
        false
      }
      else {
        val middleIndex = (startIndex + endIndex) / 2

        if (item.equals(array(middleIndex))) {
          true
        }
        else if (item < array(middleIndex)) {
          binarySearchHelper(startIndex, middleIndex - 1, item, array)
        }
        else {
          binarySearchHelper(middleIndex + 1, endIndex, item, array)
        }
      }
    }
    binarySearchHelper(0, array.length - 1, elem, array)
  }


  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    def linearSearchAux(elem: Int, array: Array[Int], index: Int): Boolean = {
      if (index > array.length-1) {
        false
      }
      else if (array(index) == elem) {
        true
      }
      else {
        linearSearchAux(elem, array, index + 1)
      }
    }
    linearSearchAux(elem, array, index = 0)
  }
}