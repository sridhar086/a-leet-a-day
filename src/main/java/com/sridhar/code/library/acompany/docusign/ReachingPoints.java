package com.sridhar.code.library.acompany.docusign;


/*

Given four integers sx, sy, tx, and ty, return true if it is possible to convert the point (sx, sy) to the point (tx, ty) through some operations, or false otherwise.

The allowed operation on some point (x, y) is to convert it to either (x, x + y) or (x + y, y).



Example 1:

Input: sx = 1, sy = 1, tx = 3, ty = 5
Output: true
Explanation:
One series of moves that transforms the starting point to the target is:
(1, 1) -> (1, 2)
(1, 2) -> (3, 2)
(3, 2) -> (3, 5)
Example 2:

Input: sx = 1, sy = 1, tx = 2, ty = 2
Output: false
Example 3:

Input: sx = 1, sy = 1, tx = 1, ty = 1
Output: true

 */
public class ReachingPoints {


    // not feasible
    public boolean reachingPoints2(int sx, int sy, int tx, int ty) {
        if(sx > tx || sy > ty)
            return false;
        if(sx == tx && sy == ty)
            return true;
        return reachingPoints2(sx+sy, sy, tx, ty) || reachingPoints2(sx, sx+sy, tx, ty);
    }

    /*
    Interesting problem that I had solved in a while

    sx  sy     tx  ty

    going from left to right could involve n no of operations. but we can reduce this down
    from highest to lowest.

    if ty > tx then ty-tx and tx
    else tx-ty and ty


    when tx == sx  or ty == sy
    we can reduce this down like tx ty%tx or tx%ty and ty because we can bring it down to the lowest.
    but caveat.

    If this condition is true then we can call this true otherwise we can keep going down the path as above
    ty - (k) tx = sy
    ty - sy = (k) tx
    (ty - sy) / tx = k
    or
    (ty - sy) % tx = 0
     */
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        if(sx == tx && sy == ty)
            return true;
        if(tx < sx || ty < sy)
            return false;

        if( (tx == sx && (ty-sy)%tx == 0) ||  ( (tx-sx)%ty == 0 && ty == sy) )
            return true;

        if(tx > ty) {
            return reachingPoints(sx, sy, tx%ty, ty);
        } else {
            return reachingPoints(sx, sy, tx, ty%tx);
        }
    }

}
