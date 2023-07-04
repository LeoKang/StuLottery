public class Main {
	// 1 ~ 23
	public static void main(String[] args) {
		String[] stu_name = { "강준형", "강지윤", "공나은", "김강연", "김미정", "김사희",
				"김현규", "김형순", "박태호", "박하영", "손승범", "손유미", "송병권",
				"신우철", "이은영", "전예서", "-----", "정세연", "정예은", "정웅기",
				"정하영", "정하원", "황다원", };
		int[] n = new int[stu_name.length];
		boolean b = true;
		
		while (b) {
			int r = (int) (Math.random() * (stu_name.length));

			if (n[r] == 0) {
				System.out.printf("%2d : %s\n", (r + 1), stu_name[r]);
				n[r] = 1;
			}

			boolean c = true;
			for (int i = 0; i < stu_name.length; i++) {
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
