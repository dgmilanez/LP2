class SimpleFrame extends JFrame {
	ArrayList<Rect> rs = new ArrayList<Rect>();
	SimpleFrame(){
		Random rand = new Random();
		for(int i=0; i<4; i++){
			int x = rand.nextInt(350);
			int y = rand.nettInt(350);
			int w = rand.nettInt(350);
			int h = rand.nettInt(350);
			rs.add(new Rect(x,y,w,h));
		}
	}
	public void paint(Graphics g){
		super.paint(g);
		for(Rect r: this.rs){
			r.paint(g);
		}
	}
}
