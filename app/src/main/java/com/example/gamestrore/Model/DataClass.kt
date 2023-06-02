package com.example.gamestrore.Model

class DataClass {
    var dataName: String? = null
    var dataGenre: String? = null
    var dataDesc: String? = null
    var dataImage: String? = null

    constructor(dataName: String?, dataGenre: String?, dataDesc: String?, dataImage: String?,){
        this.dataName = dataName
        this.dataGenre = dataGenre
        this.dataDesc = dataDesc
        this.dataImage = dataImage
    }

}