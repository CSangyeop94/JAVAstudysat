import java.util.List;

public class MemberMain {
		
	public static void main(String[] args) {
		
		//ȸ����ü ����
		MemberVO vo = new MemberVO();
		vo.setMemberno(2);
		vo.setId("hong");
		vo.setName("ȫ�浿");
		
		// dao ��ü ����
		MemberDAO dao = new MemberDAO();
		
		// ȸ�� �߰�
		int r = dao.insert(vo);
		if ( r > 0 ) {
			System.out.println("ȸ�� ��� ����");
		}
			// 2�� ȸ�� ��ȸ�� ���
			MemberVO rvo = dao.selectOne(2);
			System.out.println("ȸ������ ���");
			System.out.println("ȸ����ȣ : "+rvo.getMemberno());
			System.out.println("���̵� : "+rvo.getId());
			System.out.println("�̸� : "+rvo.getName());
			
			//ȸ������ ����
			vo.setName("��浿");
			int r2 =dao.update(vo);
			if (r2 > 0) {
				System.out.println("ȸ�� ���� ����");
			}
			// ��üȸ�� ��� ��ȸ
			System.out.println("ȸ����� ��ȸ");
			List<MemberVO> list = dao.list();
			for (int i=0; i<list.size(); i++) {
				System.out.println("ȸ����ȣ:"+list.get(i).getMemberno()
						+"\t���̵�:"+list.get(i).getId()
						+"\t�̸�:"+list.get(i).getName());
			}
			
			// ȸ�� ���� 
			int r3 = dao.delete(2);
			if (r3 > 0) {
				System.out.println("ȸ�� ���� ����");
			}
			
			// �ڿ� ����
			dao.close();
		
		}
	}

