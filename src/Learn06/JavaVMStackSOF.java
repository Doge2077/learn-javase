package Learn06;

public class JavaVMStackSOF {
    private static int stackLength = 0;

    public static void test() {
        long unused1, unused2, unused3, unused4, unused5, unused6, unused7, unused8, unused9, unused10,
                unused11, unused12, unused13, unused14, unused15, unused16, unused17, unused18, unused19, unused20,
                unused21, unused22, unused23, unused24, unused25, unused26, unused27, unused28, unused29, unused30,
                unused31, unused32, unused33, unused34, unused35, unused36, unused37, unused38, unused39, unused40,
                unused41, unused42, unused43, unused44, unused45, unused46, unused47, unused48, unused49, unused50,
                unused51, unused52, unused53, unused54, unused55, unused56, unused57, unused58, unused59, unused60,
                unused61, unused62, unused63, unused64, unused65, unused66, unused67, unused68, unused69, unused70,
                unused71, unused72, unused73, unused74, unused75, unused76, unused77, unused78, unused79, unused80,
                unused81, unused82, unused83, unused84, unused85, unused86, unused87, unused88, unused89, unused90,
                unused91, unused92, unused93, unused94, unused95, unused96, unused97, unused98, unused99, unused100,
                unused101, unused102, unused103, unused104, unused105, unused106, unused107, unused108, unused109, unused110,
                unused111, unused112, unused113, unused114, unused115, unused116, unused117, unused118, unused119, unused120,
                unused121, unused122, unused123, unused124, unused125, unused126, unused127, unused128, unused129, unused130,
                unused131, unused132, unused133, unused134, unused135, unused136, unused137, unused138, unused139, unused140,
                unused141, unused142, unused143, unused144, unused145, unused146, unused147, unused148, unused149, unused150,
                unused151, unused152, unused153, unused154, unused155, unused156, unused157, unused158, unused159, unused160,
                unused161, unused162, unused163, unused164, unused165, unused166, unused167, unused168, unused169, unused170,
                unused171, unused172, unused173, unused174, unused175, unused176, unused177, unused178, unused179, unused180,
                unused181, unused182, unused183, unused184, unused185, unused186, unused187, unused188, unused189, unused190,
                unused191, unused192, unused193, unused194, unused195, unused196, unused197, unused198, unused199, unused200;

        unused1 = unused2 = unused3 = unused4 = unused5 = unused6 = unused7 = unused8 = unused9 = unused10 =
                unused11 = unused12 = unused13 = unused14 = unused15 = unused16 = unused17 = unused18 = unused19 = unused20
                        = unused21 = unused22 = unused23 = unused24 = unused25 = unused26 = unused27 = unused28 = unused29 = unused30
                        = unused31 = unused32 = unused33 = unused34 = unused35 = unused36 = unused37 = unused38 = unused39 = unused40
                        = unused41 = unused42 = unused43 = unused44 = unused45 = unused46 = unused47 = unused48 = unused49 = unused50
                        = unused51 = unused52 = unused53 = unused54 = unused55 = unused56 = unused57 = unused58 = unused59 = unused60
                        = unused61 = unused62 = unused63 = unused64 = unused65 = unused66 = unused67 = unused68 = unused69 = unused70
                        = unused71 = unused72 = unused73 = unused74 = unused75 = unused76 = unused77 = unused78 = unused79 = unused80
                        = unused81 = unused82 = unused83 = unused84 = unused85 = unused86 = unused87 = unused88 = unused89 = unused90
                        = unused91 = unused92 = unused93 = unused94 = unused95 = unused96 = unused97 = unused98 = unused99 = unused100
                        = unused101 = unused102 = unused103 = unused104 = unused105 = unused106 = unused107 = unused108 = unused109 = unused110
                        = unused111 = unused112 = unused113 = unused114 = unused115 = unused116 = unused117 = unused118 = unused119 = unused120
                        = unused121 = unused122 = unused123 = unused124 = unused125 = unused126 = unused127 = unused128 = unused129 = unused130
                        = unused131 = unused132 = unused133 = unused134 = unused135 = unused136 = unused137 = unused138 = unused139 = unused140
                        = unused141 = unused142 = unused143 = unused144 = unused145 = unused146 = unused147 = unused148 = unused149 = unused150
                        = unused151 = unused152 = unused153 = unused154 = unused155 = unused156 = unused157 = unused158 = unused159 = unused160
                        = unused161 = unused162 = unused163 = unused164 = unused165 = unused166 = unused167 = unused168 = unused169 = unused170
                        = unused171 = unused172 = unused173 = unused174 = unused175 = unused176 = unused177 = unused178 = unused179 = unused180
                        = unused181 = unused182 = unused183 = unused184 = unused185 = unused186 = unused187 = unused188 = unused189 = unused190
                        = unused191 = unused192 = unused193 = unused194 = unused195 = unused196 = unused197 = unused198 = unused199 = unused200
                        = 1145141919810L;
        stackLength++;
        test();
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (Error e) {
            System.out.println("stack length:" + stackLength);
            throw e;
        }
    }
}
