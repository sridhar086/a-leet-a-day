package com.sridhar.code.library.acompany.datadog;

/*

given a list of lines such as starting with query, and log
Q: database
Q: snapshot
Q: database started
L: database service started


return a list
such as assign queries that can be attached to a log line

ACK: database; ID=1
ACK: snapshot; ID=2
W: database service started; Q=1, Q=3

 */

/*

My design includes a hashmap and reverse hashmap

database -> 1,3
snapshot -> 2
started -> 3

1 -> database
2 -> snapshot
3 -> database, started

 */

public class LogSearching {

}
