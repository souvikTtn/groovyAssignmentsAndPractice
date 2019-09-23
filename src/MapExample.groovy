//we should avoid use Gstrings as key to map
class MapExample {
     static void main(String[] args) {
         def key="a"
        def map=["$key":"$key value"]
         println map
         println(map["$key"])
         //unexpected output
         String key1="b"
         /*map=["$key1":key1+" value"]*/
         /*println(map)*/
         /*println(map['key1'])*/
         /*map=[key1:"key1 value"]*/
         map=[(key1):key1+"value"]
         println map[key1]


    }
}
