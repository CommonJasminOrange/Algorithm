package com.company;

public class Chess {
    int size;
    int[][] board;
    int dr;
    int dc;
    int title = 0;

    public Chess(int dr, int dc, int size){
        this.size = size;
        this.dr = dr;
        this.dc = dc;
        board = new int[size][size];
    }

    public void cheesBoard(int tr, int tc, int dr, int dc, int size){


        if (size == 1) return;

        // t:L型骨牌号,s分割棋盘
        int t = title ++;
        int s = size / 2;
        //覆盖左上角子棋盘
        if (dr < tr+s && dc < tc+s){
            cheesBoard(tr, tc, dr, dc, s);
        }else {
            //不在左上角，设左上角矩阵的右下角就是特殊点（和别的一起放置L形）
            board[tr+s-1][tc+s-1] = t; //用t号L型骨牌覆盖右下角
            cheesBoard(tr, tc, tr+s-1, tc+s-1, s);//覆盖其余方格
        }
        //覆盖右上角子棋盘
        if (dr < tr+s && dc >= tc+s){
            cheesBoard(tr, tc+s, dr, dc, s);
        }else {
            board[tr+s-1][tc+s] = t;
            cheesBoard(tr, tc+s, tr+s-1, tc+s, s);
        }
        //覆盖左下角子棋盘
        if (dr >= tr+s && dc < tc+s){
            cheesBoard(tr+s, tc, dr, dc, s);
        }else {
            board[tr+s][tc+s-1] = t;
            cheesBoard(tr+s, tc, tr+s,tc+s-1,s);
        }
        //覆盖右下角子棋盘
        if (dr >= tr+s && dc>= tc+s){
            cheesBoard(tr+s, tc+s, dr, dc, s);
        }else {
            board[tr+s][tc+s] = t;
            cheesBoard(tr+s, tc+s, tr+s, tc+s, s);
        }

    }
    public void printBoard(int dr, int dc, int size){
        cheesBoard(0, 0, dr, dc, size);
        for (int i = 0;i <board.length; i ++){
            for (int j = 0; j <board.length; j ++){
                System.out.print(String.format("%3d", board[i][j]));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 4;
        int dr = 2;
        int dc = 2;
        Chess chess = new Chess(dr, dc, N);
        System.out.println("特殊方块在第 " + dr + " 行第 " + dc + "列，覆盖后的棋盘：");
        chess.printBoard(dr, dc, N);
    }
}
