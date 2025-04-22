package org.ifsp;

public class DroneDrive {
    public static boolean caixaPassaPelaJanela(int A, int B, int C, int H, int L) {
        int[][] faces = {
                {A, B},
                {A, C},
                {B, C}
        };

        for (int[] face : faces) {
            int x = face[0];
            int y = face[1];

            if ((x <= H && y <= L) || (x <= L && y <= H)) {
                return true;
            }
        }

        return false;
    }
}
