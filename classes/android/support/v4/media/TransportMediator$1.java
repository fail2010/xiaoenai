package android.support.v4.media;

import android.view.KeyEvent;

class TransportMediator$1
  implements TransportMediatorCallback
{
  TransportMediator$1(TransportMediator paramTransportMediator) {}
  
  public long getPlaybackPosition()
  {
    return this.this$0.mCallbacks.onGetCurrentPosition();
  }
  
  public void handleAudioFocusChange(int paramInt)
  {
    this.this$0.mCallbacks.onAudioFocusChange(paramInt);
  }
  
  public void handleKey(KeyEvent paramKeyEvent)
  {
    paramKeyEvent.dispatch(this.this$0.mKeyEventCallback);
  }
  
  public void playbackPositionUpdate(long paramLong)
  {
    this.this$0.mCallbacks.onSeekTo(paramLong);
  }
}


/* Location:              E:\apk\xiaoenai2\classes-dex2jar.jar!\android\support\v4\media\TransportMediator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */