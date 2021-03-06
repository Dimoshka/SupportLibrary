package com.syject.support.android.async;

public final class CancellationToken
{
	private final CancellationTokenSource _cancellationTokenSource;
	
	public CancellationToken(CancellationTokenSource cancellationTokenSource)
	{
		_cancellationTokenSource = cancellationTokenSource;
	}
	
	public boolean isCancelleationRequested() { return _cancellationTokenSource.isCancelleationRequested(); }
	public WaitHandle waitHandle() { return _cancellationTokenSource._waitHandle; }
	
}
