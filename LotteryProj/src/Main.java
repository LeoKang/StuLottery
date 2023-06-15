public class Main {
	// 1 ~ 23
	public static void main(String[] args) {
		int STU_NUM = 23;
		int[] n = new int[STU_NUM];
		String[] stu_name = { "강준형", "강지윤", "공나은", "김강연", "김미정", "김사희",
				"김현규", "김형순", "박태호", "박하영", "손승범", "손유미", "송병권",
				"신우철", "이은영", "전예서", "정가영", "정세연", "정예은", "정웅기",
				"정하영", "정하원", "황다원", };
		boolean b = true;
		while (b) {
			int r = (int) (Math.random() * (STU_NUM));

			if (n[r] == 0) {
				System.out.printf("%2d : %s\n", (r + 1), stu_name[r]);
				n[r] = 1;
			}

			boolean c = true;
			for (int i = 0; i < STU_NUM; i++) {
				if (n[i] == 0) {
					c = false;
					break;
				}
			}
			if (c == true) {
				b = false;
			}
		}
	}
}
