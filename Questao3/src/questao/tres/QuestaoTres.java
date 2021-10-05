package questao.tres;

public class QuestaoTres {
	
	public int qntdElementos(int[] var) {
		int i, val=0;
		for(i=0; i<var.length; i++) {
			if (var[i]<0) {
				val++;
			}
		}
		return val;
	}

}
