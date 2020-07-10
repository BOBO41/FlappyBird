package com.bird.util;

import java.awt.Color;
import java.awt.Font;

/**
 * 常量类
 * 
 * @author Kingyu 后续优化可写入数据库或文件中，便于修改
 */

public class Constant {
	// 窗口尺寸
	public static final int FRAME_WIDTH = 420;
	public static final int FRAME_HEIGHT = 640;

	// 游戏标题
	public static final String GAME_TITLE = "Flappy Bird";

	// 窗口位置
	public static final int FRAME_X = 1200;
	public static final int FRAME_Y = 100;

	// 图像资源路径
	public static final String BG_IMG_PATH = "img/background.png";

	public static final String[][] BIRDS_IMG_PATH = {
			{ "img/0.png", "img/1.png", "img/2.png", "img/3.png", "img/4.png", "img/5.png", "img/6.png", "img/7.png" },
			{ "img/up.png", "img/up.png", "img/up.png", "img/up.png", "img/up.png", "img/up.png", "img/up.png",
					"img/up.png" },
			{ "img/down_0.png", "img/down_1.png", "img/down_2.png", "img/down_3.png", "img/down_4.png",
					"img/down_5.png", "img/down_6.png", "img/down_7.png" },
			{ "img/dead.png", "img/dead.png", "img/dead.png", "img/dead.png", "img/dead.png", "img/dead.png",
					"img/dead.png", "img/dead.png", } };

	public static final String[] CLOUDS_IMG_PATH = { "img/cloud_0.png", "img/cloud_1.png" };

	public static final String[] PIPE_IMG_PATH = { "img/pipe.png", "img/pipe_top.png", "img/pipe_bottom.png" };

	public static final String TITLE_IMG_PATH = "img/title.png";
	public static final String NOTICE_IMG_PATH = "img/start.png";
	public static final String SCORE_IMG_PATH = "img/score.png";
	public static final String OVER_IMG_PATH = "img/over.png";
	public static final String AGAIN_IMG_PATH = "img/again.png";

	// 游戏背景色
	public static final Color BG_COLOR = new Color(0x4bc4cf);

	// 游戏刷新间隔
	public static final int GAME_INTERVAL = 1000 / 60;

	// 标题栏高度
	public static final int TOP_BAR_HEIGHT = 38;

	// 地面高度
	public static final int GROUND_HEIGHT = 35;

	public static final int CLOUD_BORN_PERCENT = 6; // 云朵生成的概率，单位为百分比
	public static final int CLOUD_IMAGE_COUNT = 2; // 云朵图片的个数
	public static final int MAX_CLOUD_COUNT = 7; // 云朵的最大数量
	public static final int CLOUD_DIRCHANGE = 50; // 云朵随机改变方向的概率，越大表示概率越小
	
	public static final Font TIME_FONT = new Font("华文琥珀", Font.BOLD, 32);//字体
	public static final Font SCORE_FONT = new Font("华文琥珀", Font.BOLD, 24);//字体
	
	public static final String SCORE_FILE_PATH = "./score";

}
