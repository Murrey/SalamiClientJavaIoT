

package it.bway.salami.communication;

    public class SalamiHttpClient
    {
        private String url;
        public SalamiHttpClient(String url)
        {
            this.url = url;
        }
        public async Task<ResponseAdapter> get()
        {
            HttpClient client = new HttpClient();
            client.BaseAddress = new Uri(url);
            String response = await client.GetStringAsync(client.BaseAddress + "?" +((int)DateTime.Now.Millisecond));
            return new ResponseAdapter(response);
        }
    }

