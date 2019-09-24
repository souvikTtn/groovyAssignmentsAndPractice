package groovyAssignments.assignment1

        def src = new File('../../files/kepler_hist_big.gif')
        def dst = new File('../../files/byteImage')
        dst << src.bytes

/*def dst = new File('../../files/byteImage')*/
dst.eachByte {
        println(it)
}