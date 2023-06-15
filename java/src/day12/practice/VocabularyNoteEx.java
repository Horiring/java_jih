package day12.practice;

public class VocabularyNoteEx {

	public static void main(String[] args) {
		//영어 단어장을 만들기 위해 필요한 객체를 만들고 테스트 해보세요.
		Word word1 = new Word("vocabulary", "(개인이 아는·사용하는) 어휘");
		word1.print();
		word1.addMeaning("(특정 언어의 모든) 어휘");
		word1.print();
		word1.removeMeaning(1);
		word1.print();
	}
}
