const sendPost = async (investigationId, plaintext) => {
  const raw_reponse = await fetch(
    `htf.bewire.org/investigation/${investigationId}/`,
    {
      method: "POST",
      headers: {
        Accept: "application/json",
        "Content-Type": "application/json",
      },
      body: JSON.stringify({ answer: plaintext }),
    }
  );
  if (raw_reponse.status === 200) {
    const content = await raw_reponse.json();
    console.log(content);
  }
};

const plaintext = "sdspqocvwgkfmq";
const investigationId = "bf7ee724-d2df-496c-bad2-ef7d0de84c28";

sendPost(investigationId, plaintext);
