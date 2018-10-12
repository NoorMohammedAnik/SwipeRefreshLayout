# SwipeRefreshLayout
Example of Android SwipeRefreshLayout – Android Pull/Swipe Down to Refresh

Android SwipeRefreshLayout is a ViewGroup that can hold only one scrollable child. 
It can be either a ScrollView, ListView or RecyclerView. The basic need for a SwipeRefreshLayout is to allow the users to refresh
the screen manually. This is pretty common in the Facebook Newsfeed screen. Before this layout was available in the support library,
we had to resort to creating and detecting custom swipe down gestures to refresh let’s say a ListView.

This class consists of one important listener that is OnRefreshListener. On swiping down this listener is triggered and the OnRefresh()
method is called. We can override this method according to our needs.

* We’ve added a shuffle method that shuffles the whole ArrayList every time the onRefresh() is called.
* We’ve used the Collections framework method to randomly shuffle the ArrayList by setting a random seed as the current time in milli seconds.
* setRefreshing(false) is an important line of code. It notifies the SwipeRefreshLayout instance that the refreshing is completed and it should stop the refreshing loader animation.
* The default refreshing animation color is set to black. We can change it using the method setColorSchemeResources()
