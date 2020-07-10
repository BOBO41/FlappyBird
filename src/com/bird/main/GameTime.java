package com.bird.main;

import java.awt.Color;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.bird.util.Constant;

/**
 * 游戏计时类
 * 
 * @author Kingyu
 *
 */
public class GameTime {
	private int timeState; // 游戏的状态
	public static final int STATE_READY = 0; // 计时就绪
	public static final int STATE_START = 1; // 计时开始
	public static final int STATE_OVER = 2; // 计时结束

	private long startTime = 0; // 开始时间 ms
	private long endTime = 0; // 开始时间 ms
	private long bestTime; // 最高纪录时间 ms

	public GameTime() {
		timeState = STATE_READY;
		bestTime = -1;

		try {
			loadBestTime();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 装载最高纪录
	private void loadBestTime() throws Exception {
		File file = new File(Constant.SCORE_FILE_PATH);
		if (file.exists()) {
			DataInputStream dis = new DataInputStream(new FileInputStream(file));
			bestTime = dis.readLong();
			dis.close();
		}
	}
	
	//保存最高纪录
	public void saveBestTime(long time) throws Exception{
		File file = new File(Constant.SCORE_FILE_PATH);
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
		dos.writeLong(time);
		dos.close();
	}

	public long getBestTime() {
		return bestTime;
	}
	
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public void setOverTime(long endTime) {
		this.endTime = endTime;
	}

	/**
	 * 游戏用时，秒
	 * 
	 * @return
	 */
	public long getTime() {
		if (timeState == STATE_READY) {
			return startTime;
		} else if (timeState == STATE_START) {
			return (System.currentTimeMillis() - startTime);
		} else {
			return (endTime - startTime);
		}
	}

	public long getTimeInSeconds() {
		return getTime() / 1000;
	}

	// 是否准备开始计时
	public boolean isReadyTiming() {
		return timeState == STATE_READY;
	}

	// 开始计时
	public void startTiming() {
		startTime = System.currentTimeMillis();
		timeState = STATE_START;
	}

	// 结束计时
	public void endTiming() {
		endTime = System.currentTimeMillis();
		timeState = STATE_OVER;
		
		//判断本次记录是否保存
		long time = getTimeInSeconds();
		if(bestTime < time)
			bestTime = time;
			try {
				saveBestTime(bestTime);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	/**
	 * 是否正在计时
	 * 
	 * @return
	 */
	public boolean isTiming() {
		return timeState == STATE_START;
	}

	public void reset() {
		timeState = STATE_READY;
		startTime = 0;
		endTime = 0;
	}

}
