package vjezbe3Z1;

class Player {

	private int x;
	private int y;
	private int width;
	private int height;
	private int health;

	public Player(int x, int y, int width, int height, int health) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.health = 100;
		setHealth(health);
	}
	//Getteri i Setteri


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHealth() {
		return health;
	}

	// Seter sa provjerom
	public void setHealth(int health) {
		if (health >= 0 && health <= 100) {
			this.health = health;
		} else {
			System.out.println("Health mora bit izmedju 0 - 100");
		}
	}
}

class Enemy {

	private int x;
	private int y;
	private int width;
	private int height;
	private int damage;

	public Enemy(int x, int y, int width, int height, int damage) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.damage = 0;
		setDamage(damage);
	}
	//Getteri i Setteri

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDamage() {
		return damage;
	}

	// Seter sa provjerom
	public void setDamage(int damage) {
		if (damage >= 0 && damage <= 100) {
			this.damage = damage;
		} else {
			System.out.println("Damage mora bit izmedju 0 - 100");
		}
	}

public class Game {
	
	
	// Preklapanje po x osi i y osi
	//sudar postoji ako se obije ose preklapaju

	public static boolean checkCollision(Player p, Enemy e) {
		boolean preklapanjeX = p.getX() < e.getX() + e.getWidth()
					&& p.getX() + p.getWidth() > e.getX();
		boolean preklapanjeY = p.getY() < e.getY() + e.getHeight()
					&& p.getY() + p.getHeight() > e.getY();
		return preklapanjeX && preklapanjeY;
		}

	//Smajnjuje health igraca ali ne ispod nule
		public static void decreaseHealth(Player p, Enemy e) {
			int noviHealth = p.getHealth() - e.getDamage();
			if (noviHealth < 0) {
				noviHealth = 0;
			}
			p.setHealth(noviHealth);
		}

		public static void main(String[] args) {
			Player player = new Player(0, 0, 50, 50, 100);
			Enemy enemy1 = new Enemy(30, 20, 40, 40, 30);
			Enemy enemy2 = new Enemy(200, 200, 20, 20, 50);

			System.out.println("Pocetni health: " + player.getHealth());

			if (checkCollision(player, enemy1)) {
				System.out.println("Sudar sa enemy1");
				decreaseHealth(player, enemy1);
			} else {
				System.out.println("Nema sudara sa enemy1");
			}
			System.out.println("Health: " + player.getHealth());

			if (checkCollision(player, enemy2)) {
				System.out.println("Sudar sa enemy2");
				decreaseHealth(player, enemy2);
			} else {
				System.out.println("Nema sudara sa enemy2");
			}
			System.out.println("Health: " + player.getHealth());
		}
	}
}


