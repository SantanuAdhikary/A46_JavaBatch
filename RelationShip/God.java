
class Heart
{
	void heartBeat()
	{
		System.out.println("heartbeat started");
	}
}

class Boy
{
	Heart h = new Heart();    // composition
	Boy()
	{
		System.out.println("boy has taken birth");
		h.heartBeat();
	}
}


class  God
{
	public static void main(String[] args) 
	{
		Boy b = new Boy();
		System.out.println("-----------------------");
		Boy b2 = new Boy();
	}
}
