package vn.edu.hust.gmail

data class ItemModel(val mail: String, val title: String, val content: String, val time: String) {
    var selected: Boolean = false

}