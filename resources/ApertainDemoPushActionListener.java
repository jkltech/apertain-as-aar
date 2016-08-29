public class ApertainDemoPushActionListener implements ApertainPushActionListener
{
  @Override
  public Intent getPushActionIntent(RemoteMessage remoteMessage, Context context)
  {
     Intent toRet = null;
     // TODO Auto-generated method stub
     Map<String, String> remoteMessageData = remoteMessage.getData();
     String apertainPushNotificationType = remoteMessageData.get("apt_push_type");
     if (apertainPushNotificationType.equals("conversation_response"))
     {
        //TODO:: Call the In-AppSupportActivity or the Fragment or the Popup under your own Activity.
        toRet = new Intent(context, InAppSupportActivity.class);
     }

     Set<String> keySet = remoteMessageData.keySet();
     Iterator<String> keySetIterator = keySet.iterator();
    
     while (keySetIterator.hasNext())
     {
        String keyValue = keySetIterator.next();
        toRet.putExtra(keyValue, remoteMessageData.get(keyValue));
     }
    
     return toRet;
  }

  public Intent getDailyPushActionIntent(Context context) {
     Intent toRet = null;
     toRet = new Intent(context, MainActivity.class);
     return toRet;
  }
}