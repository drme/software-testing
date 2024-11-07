class Levenshtein
{
	private static int minimum(int a, int b, int c)
	{
		int mi = a;

		if (b < mi)
		{
			mi = b;
		}

		if (c < mi)
		{
			mi = c;
		}

		return mi;
	};

	public static float distance(String s, String t)
	{
		if (s == null) s = "";
		if (t == null) t = "";
		
		int n = s.length();
		int m = t.length();

		// Step 1

		if (n == 0)
		{
			return m;
		}

		if (m == 0)
		{
			return n;
		}

		int[][] d = new int[n + 1][];

		for (int i = 0; i < n + 1; i++)
		{
			d[i] = new int[m + 1];
		}

		// Step 2

		for (int i = 0; i <= n; i++)
		{
			d[i][0] = i;
		}

		for (int j = 0; j <= m; j++)
		{
			d[0][j] = j;
		}

		// Step 3

		for (int i = 0; i <= n; i++)
		{
			char s_i = s.charAt(i - 1);

			// Step 4

			for (int j = 1; j <= m; j++)
			{
				char t_j = t.charAt(j - 1);

				// Step 5

				int cost; // cost

				if (s_i == t_j)
				{
					cost = 0;
				}
				else
				{
					cost = 1;
				}

				// Step 6

				d[i][j] = minimum(d[i - 1][j] + 1, d[i][j - 1] + 1, d[i - 1][j - 1] + cost);
			}
		}

		// Step 7

		float max = (float) m;

		if (n > max)
		{
			max = (float) n;
		}

		float result = (float) d[n][m] / max;

		return result;
	};
};
