select owner_id , owner_name, DISTINCT COUNT(*) as different_category_count
from owner left join article
on owner.owner_id=article.owner_id
left join category_article_mapping
on article.article_id=category_article_mapping.article_id
left join category
on category_article_mapping.category_id=category.category_id
group by category_id
order by different_category_count
